clear;clc;
fprintf('Passed all tests if no error message shows up\n\n')

assert(timeToTemp(45,60,45)==47.75)

assert(timeToTemp(45,65,45)==52.47)

assert(timeToTemp(45,65,50)==49.19)

assert(timeToTemp(50,65,50)==38.33)
