package ru.mephi.java.ch02.sec14;

import java.util.ArrayList;

public class Network {
    public class Member { // Member is an inner class of Network
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void leave() {
            unenroll(this);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member m) {
        members.remove(this);
    }

    private ArrayList<Member> members = new ArrayList<>();
}
