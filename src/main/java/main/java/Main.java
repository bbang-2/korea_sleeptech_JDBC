package main.java;

import main.java.manger.MemberManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        MemberManager mm = new MemberManager();
        try {
            mm.run();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}