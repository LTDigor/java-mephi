package ru.mephi.java.ch02.dop;

public class dop {
    public static void main(String[] args) {
        Network vk = new Network();
        Network facebook = new Network();

        Network.Member ivan = vk.enroll("Ivan");
        Network.Member anton  = vk.enroll("Anton");
        Network.Member julia  = vk.enroll("Julia");
        Network.Member vadim  = vk.enroll("Vadim");

        ivan.writeNext("Hello");
        anton.writePrev("Hi");
        anton.writeNext("My name is Anton");
        julia.writeNext("Privet!");

        julia.leave();
        facebook.enroll(julia);
        ivan.writeNext("Nooo!");
        anton.writeNext("Hi vadim");

        ivan.leave();
        facebook.enroll(ivan);
        ivan.writePrev("I won't leave you");

    }
}
