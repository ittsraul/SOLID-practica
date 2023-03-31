Solution without Solid, just solve the problem:


@ID of the commit: 1a16cbfa6c778420145fcf223c11f583f3a0aa78

In this commit i was solve the problem who is announced at the activity, so i was delete the strcture because if i solve the problems with solid, the estructure will be delated.


# Errors founded:


SRP - Principio Responsabilidad unica

@ID of the commit: ef153abe5460291d04e434728f2086c111997c7f

In this commit we told the changes in the fileManager because the interface was more tasks-funcionalities. So we fork this interface and as result the Manager interface will do the manager tasks and our interface will do manage the directories 

the new fragment of work is the interface  Manager.java who take a lot of methods or variables in filemanager and put in the interface. 

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