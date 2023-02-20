package com.company;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
        //System.out.println(args[0]);
      fall2(11);
    }

    //handle
    static void fall(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //declare
    static void fall2(int distance) throws IOException{
      if (distance > 10){
          throw new IOException();
      }
    }

}
