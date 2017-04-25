function insertData(curr, pref, out, time)
    fileID = fopen('ex1data2.txt','a');
    fprintf(fileID,'\n%d,%d,%d,%d',curr, pref, out, time);
    fclose(fileID);
end