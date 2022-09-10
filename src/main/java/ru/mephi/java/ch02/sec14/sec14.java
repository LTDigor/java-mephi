package ru.mephi.java.ch02.sec14;

public class sec14 {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("fred");

        fred.leave();
    }
}

/*
PS D:\Files\MyProjects\java-mephi\src\main\java\ru\mephi\java\ch02\sec14> javac .\Network.java
PS D:\Files\MyProjects\java-mephi\src\main\java\ru\mephi\java\ch02\sec14> javap -private .\Network.class
Compiled from "Network.java"
public class ru.mephi.java.ch02.sec14.Network {
  private java.util.ArrayList<ru.mephi.java.ch02.sec14.Network$Member> members;
  public ru.mephi.java.ch02.sec14.Network();
  public ru.mephi.java.ch02.sec14.Network$Member enroll(java.lang.String);
  public void unenroll(ru.mephi.java.ch02.sec14.Network$Member);
}
PS D:\Files\MyProjects\java-mephi\src\main\java\ru\mephi\java\ch02\sec14> javap -private '.\Network$Member.class'
Compiled from "Network.java"
public class ru.mephi.java.ch02.sec14.Network$Member {
  private java.lang.String name;
  private java.util.ArrayList<ru.mephi.java.ch02.sec14.Network$Member> friends;
  final ru.mephi.java.ch02.sec14.Network this$0;
  public ru.mephi.java.ch02.sec14.Network$Member(ru.mephi.java.ch02.sec14.Network, java.lang.String);
  public void leave();
  public boolean belongsTo(ru.mephi.java.ch02.sec14.Network);
}
PS D:\Files\MyProjects\java-mephi\src\main\java\ru\mephi\java\ch02\sec14>

 */
