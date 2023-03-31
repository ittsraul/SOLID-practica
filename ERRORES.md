# Solution without Solid, just solve the problem:


@ID of the commit: 1a16cbfa6c778420145fcf223c11f583f3a0aa78

In this commit i was solve the problem who is announced at the activity, so i was delete the strcture because if i solve the problems with solid, the estructure will be delated.


## SOLID  principles found, of which the following are not met

* RESPONSABILIDAD ÚNICA 

The files has more funcionalities, so we can fork this in other classes.



* ABIERTO-CERRADO

The files has a conditions, who can be incremented, and shouldn't be modificated/changed his estructure.

```java
package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.File;
import com.kreitek.files.FileSystemItem;

import java.util.List;

public class FileManager {

    
	public static int calculateSize(FileSystemItem fileSystemItem) {
        int totalSize = 0;

        // cualquier clase que proveganga de la interfaz filesystemitem
            totalSize = fileSystemItem.getSize();
        return totalSize;
    }

//    public static int calculateSize(List<FileSystemItem> files) {
//        int totalSize = 0;
//
//        for(FileSystemItem item : files) {
//            if (item instanceof File) {
//                totalSize += item.getSize();
//            } else if (item instanceof Directory) {
//                totalSize += calculateSize(item.listFiles());
//            }
//            
//        }
//
//        return totalSize;
//    }
	
	
    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
	
	
	
}

```

* SEGREGACIÓN DE INTERFACES


```java

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

```

### The solution will be create a new interface to fork the funcionalities.

```java

package com.kreitek.files;
 
public interface Manager {
 	String getName();
 	void setName(String name);
 	String getExtension();
 	int getSize();
 	void open();
 	void close();
	void setPosition(int numberOfBytesFromBeginning);
 	byte[] read(int numberOfBytesToRead);
 	void write(byte[] buffer);
}

```

# Errors founded:


SRP - Principio Responsabilidad unica

@ID of the commit: ef153abe5460291d04e434728f2086c111997c7f

In this commit we told the changes in the fileManager because the interface was more tasks-funcionalities. So we fork this interface and as result the Manager interface will do the manager tasks and our interface will do manage the directories 

the new fragment of work is the interface  Manager.java who take a lot of methods or variables in filemanager and put in the interface. 


```java

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

```

### The solution will be create a new interface to fork the funcionalities.

```java

package com.kreitek.files;
 
public interface Manager {
 	String getName();
 	void setName(String name);
 	String getExtension();
 	int getSize();
 	void open();
 	void close();
	void setPosition(int numberOfBytesFromBeginning);
 	byte[] read(int numberOfBytesToRead);
 	void write(byte[] buffer);
}

```

@ID of the commit: **d888a751b9e6f7f982d58dacb6471caaa254efc6**


Apllying the single Responsability principle in the filesystem.java who must do a single functions, not more functions.


## Principio abierto-cerrado:

@ID of the commit