package com.kreitek.files;

public class DirectoryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	@Override
		    public void addFile(FileSystemItem file) {
		        throw new UnsupportedOperationException("No es válido para ficheros");
		    }
		 	
		 	@Override
		    public void removeFile(FileSystemItem file) {
		        throw new UnsupportedOperationException("No es válido para ficheros");
		    }
		 	
		 	@Override
		 	  public void removeFile(FileSystemItem file) {
		 	      files.remove(file);
		 	  }
	}

}
