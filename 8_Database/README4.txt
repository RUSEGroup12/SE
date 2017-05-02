For the MATLAB machine learning algorithm its necessary to record
previously recorded data in order to better predict future time to 
temperatures. The data is currently being stored in a text file for
demo purposes and also due to the fact that we dont have access to
the MATLAB Production Server System which has a database where
these values could be stores. Each data tuple consistions of 3 temperatures
and 1 time value. [Current, Preferred, Outside, Time-to-temperature].
Each time a new data tuple is recorded in the users home, the data is sent
to the file and the algorithm calculates new parameters.

Otherwise the server has a python dictionary that saves the data