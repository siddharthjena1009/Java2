class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

class Member {
    private int memberID;
    private String lastName;
    private String firstName;
    private int handicap;
    private char gender;
    private String team;
    private String memberType;
    private int coach;
    private long phone;
    private Date joinDate;

    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team,
            String memberType, int coach, long phone, Date joinDate) {
        this.memberID = memberID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    public int getMemberID() {
        return memberID;
    }

    // public String getLastName() {
    // return lastName;
    // }

    // public String getFirstName() {
    // return firstName;
    // }

    public int getHandicap() {
        return handicap;
    }

    public char getGender() {
        return gender;
    }

    public String getTeam() {
        return team;
    }

    public String getMemberType() {
        return memberType;
    }

    // public int getCoach() {
    // return coach;
    // }

    // public long getPhone() {
    // return phone;
    // }

    public Date getJoinDate() {
        return joinDate;
    }

    // public String getJoinMonth() {
    //     return joinDate.getMonth();
    // }

    // public int getJoinDay() {
    //     return joinDate.getDay();
    // }

    public void display() {
        System.out.println("");
        System.out.println("Member ID: " + memberID);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Join Date: " + joinDate.getDay() + "-" + joinDate.getMonth() + "-" + joinDate.getYear());
        System.out.println("----------------------------------");
        System.out.println();
    }
}

public class GolfClubMemberDatabase {
    public static void main(String[] args) {
        Member[] members = {
        
        new Member(118, "McKenzie", "Melissa", 30, 'F', "", "Junior", 153, 963270L, new Date(28, "May", 2005))
        ,new Member(138, "Stone", "Michael", 30, 'M', "", "Senior", 0, 983223L, new Date(31, "May", 2009))
        ,new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649L, new Date(12, "Aug", 2006))
        ,new Member(176, "Branch", "Helen", 0, 'F', "", "Social", 0, 589419L, new Date(6, "Dec", 2011))
        ,new Member(178, "Beck", "Sarah", 0, 'F', "", "Social", 0, 226596L, new Date(24, "Jan", 2010))
        ,new Member(228, "Burton", "Sandra", 26, 'F', "", "Junior", 153, 244493L, new Date(9, "Jul", 2013))
        ,new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954L,new Date(5, "Mar", 2008))
        ,new Member(239, "Spence", "Thomas", 10, 'M', "", "Senior", 0, 697720L, new Date(22, "Jun", 2006))
        ,new Member(258, "Olson", "Barbara", 16, 'F', "", "Senior", 0, 370186L, new Date(29, "Jul", 2013))
        ,new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681L,new Date(13, "Aug", 2013))
        ,new Member(290, "Sexton", "Thomas", 26, 'M', "", "Senior", 235, 268936L, new Date(28, "Jul", 2008))
        ,new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393L, new Date(18, "May", 2009))
        ,new Member(331, "Schmidt", "Thomas", 25, 'M', "", "Senior", 153, 867492L, new Date(7, "Apr", 2009))
        ,new Member(332, "Bridges", "Deborah", 12, 'F', "", "Senior", 235, 279087L, new Date(23, "Mar", 2007))
        ,new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813L, new Date(17, "Apr", 2009))
        ,new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558L, new Date(30, "May", 2007))
        ,new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353L,new Date(27, "Nov", 2007))
        ,new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664L, new Date(5, "Aug", 2005))
        ,new Member(469, "Willis", "Carolyn", 29, 'F', "", "Junior", 0, 688378L, new Date(14, "Jan", 2011))
        ,new Member(487, "Kent", "Susan", 0, 'F', "", "Social", 0, 707217L, new Date(7, "Oct", 2010))
        };


        System.out.println("Members with join date before 2009-04-07:");
        for (Member member : members) {
          if(member.getJoinDate().getYear() < 2009
          || (member.getJoinDate().getYear() == 2009
          && (member.getJoinDate().getMonth().equals("Jan")
          || (member.getJoinDate().getMonth().equals("Feb") && member.getJoinDate().getDay() < 7)))) {
              member.display();
          }
       
        }

        System.out.println("\nSenior members with handicap score less than 12:");
        for (Member member : members) {
            if (member.getMemberType().equals("Senior") && member.getHandicap() < 12) {
                member.display();
            }
        }

        System.out.println("\nFemale senior members in TeamB:");
        for (Member member : members) {
            if (member.getGender() == 'F' && member.getMemberType().equals("Senior")
                    && member.getTeam().equals("TeamB")) {
                member.display();
            }
        }
    }
}