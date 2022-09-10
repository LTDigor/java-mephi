package ru.mephi.java.ch02.dop;

import java.util.ArrayList;

public class Network {
     public class Member { // Member is an inner class of Network
        private String name;
        private Member nextMember;
        private Member prevMember;

        public Member(String name) {
            this.name = name;
            nextMember = null;
            prevMember = null;
        }

        public void leave() {
            unenroll(this);
        }

        public boolean belongsTo(Network newNetwork) {
            return Network.this == newNetwork;
        }

        public void writePrev(String message) {
            System.out.println(this.name + " to " + this.prevMember.name + ": " + message);
        }

         public void writeNext(String message) {
             System.out.println(this.name + " to " + this.nextMember.name + ": " + message);
         }
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);

        return enroll(newMember);
    }

    public Member enroll(Member newMember) {
        members.add(newMember);
        if (members.size() > 1) {
            newMember.nextMember = members.get(0);
            newMember.prevMember = members.get(members.size() - 2);
            newMember.prevMember.nextMember = newMember;
        }

        //there was only one member
        if (members.size() == 2) {
            members.get(0).nextMember = newMember;
            members.get(0).prevMember = newMember;
        }

        return newMember;
    }

    public void unenroll(Member member) {
         //will be only one member
         if (members.size() == 2) {
             member.prevMember.prevMember = null;
             member.prevMember.nextMember = null;
         }
         else {
             member.prevMember.nextMember = member.nextMember;
             member.nextMember.prevMember = member.prevMember;
         }

         member.nextMember = null;
         member.prevMember = null;
         members.remove(member);
    }

    private ArrayList<Member> members = new ArrayList<>();
}
