function timeToTemp(initial, final, outside)
    data = load('ex1data2.txt');
    X = data(:, 1:3); % [init final outside]  get first 3 colomns
    time = data(:, 4); % get the forth colomn (time)
    m = length(time);  %number of rows or enteries of data
    
    [X mu sigma] = featureNormalize(X);
    X = [ones(m, 1) X];
    
    alpha = .1;
    num_iters = 50;
    theta = zeros(4, 1);
    [theta, J_history] = gradientDescentMulti(X, time, theta, alpha, num_iters);

    if sigma(1) ~= 0
        x1 = (initial - mu(1))/sigma(1);
    else
        x1 = 0;
    end

    if sigma(2) ~= 0
        x2 = (final - mu(2))/sigma(2);
    else
        x2 = 0;
    end

    if sigma(3) ~= 0
        x3 = (outside - mu(3))/sigma(3);
    else
        x3 = 0; 
    end


    predict = [1 x1 x2 x3];
    time = predict * theta;

    fprintf(['Predicted time of [init = %d° final = %d° outside = %d°] ' ...
             ':\n%.1f minutes\n\n'], initial, final, outside, abs(time));
         
end
     
     
     