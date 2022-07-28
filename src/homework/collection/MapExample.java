package homework.collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        List<FootballTeamMember> teamPlayers = new ArrayList<>();
        teamPlayers.add(new FootballTeamMember(1,"Poxos"));
        teamPlayers.add(new FootballTeamMember(2,"Mardiros"));
        teamPlayers.add(new FootballTeamMember(3,"Petros"));
        teamPlayers.add(new FootballTeamMember(4,"Buffon"));
        Map<Integer, String> teamPlayersName = new HashMap<>();
        teamPlayersName.put(1,"Aram Sargsyan");
        teamPlayersName.put(2,"Zaven Voskerchyan");
        System.out.println(createFootballTeam(teamPlayers));
        System.out.println(removeFromMap("Petros", 3));
        printAllMemberNames(teamPlayersName);
        printAllMembers(teamPlayersName);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> crateTeam  = new HashMap<>();
        for (FootballTeamMember member : members) {
            crateTeam.put(member.getNumber(), member.getName());
            if (crateTeam.size() == members.size()) return crateTeam;
        }
        return null;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(String memberMap, Integer removedNumber) {
        Map<Integer, String> states = new HashMap<>();
        for (Integer integer : states.keySet()) {
            if (integer != removedNumber) {
                return true;
            }
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        Collection<String> name;
        name = memberMap.values();
        System.out.println(name);
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for( Map.Entry<Integer, String> entry : memberMap.entrySet() ){
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}