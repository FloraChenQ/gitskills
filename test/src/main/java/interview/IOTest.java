/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
  public static void main(String[] args) {
    FileInputStream fin = null;
    FileOutputStream fout = null;
    try {
      fin = new FileInputStream("/home/flora/Desktop/test.txt");
      fout = new FileOutputStream("/home/flora/Desktop/testout.txt");

      byte[] buffer = new byte[1024];
      int length;
      while( (length = fin.read(buffer)) != -1){
        fout.write(buffer,0,length);
        fout.flush();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      if(fin != null){
        try{
          fin.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      if(fout != null){
        try{
          fout.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
