% Initialization
clear ; close all; clc

%% Feature Normalization

fprintf('Loading data ...\n');

% Load Data
data = load('ex1data2.txt');
X = data(:, 1:3); % [init final outside]
time = data(:, 4);
m = length(time);

% Print out some data points
%fprintf('First 10 examples from the dataset: \n');
%fprintf(' x = [%.0f %.0f %.0f], time = %.0f \n', [X(1:10,:) time(1:10,:)]');
%fprintf('Program paused. Press enter to continue.\n\n');
%pause;
% Scale features and set them to zero mean


fprintf('Normalizing Features ...\n');

[X mu sig
    ma] = featureNormalize(X); % X = normalize matrix, 
                                    % mu is column mean, sigma is column
                                    % std

% Add intercept term to X
X = [ones(m, 1) X];


%% ================ Part 2: Gradient Descent ================

fprintf('Running gradient descent ...\n');

% Choose some alpha value
alpha = .1;
num_iters = 50;

% Init Theta and Run Gradient Descent 
theta = zeros(4, 1);
[theta, J_history] = gradientDescentMulti(X, time, theta, alpha, num_iters);

% Plot the convergence graph
figure;
plot(1:numel(J_history), J_history, '-b', 'LineWidth', 2);
xlabel('Number of iterations');
ylabel('Cost J');

% Displatime gradient descent's result
fprintf('Theta computed from gradient descent: \n');
fprintf(' %f \n', theta);
fprintf('\n');

if sigma(1) ~= 0
    x1 = (64 - mu(1))/sigma(1);
else
    x1 = 0;
end
    
if sigma(2) ~= 0
    x2 = (70 - mu(2))/sigma(2);
else
    x2 = 0;
end
    
if sigma(3) ~= 0
    x3 = (47 - mu(3))/sigma(3);
else
    x3 = 0; 
end
    

predict = [1 x1 x2 x3];
time = predict * theta;

fprintf(['Predicted time of [init = 64° final = 70° outside = 47°] ' ...
         ':\n %.1f\n'], abs(time));