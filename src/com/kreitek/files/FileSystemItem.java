package com.kreitek.files;

import java.util.List;

// We can see about this interface are doing more funcionality, so we should fork the funcionality in more files
// The name of the new file/interface will be a file for example.
public interface FileSystemItem {
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);                                             
    String getExtension();                           
    int getSize();                                   
    void open();                                     
     void close();                                    
     void setPosition(int numberOfBytesFromBeginning);
     byte[] read(int numberOfBytesToRead);            
     void write(byte[] buffer); 
}