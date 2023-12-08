package com.softserveinc.speakukrainian.utils.jdbc.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClubEntity {
    private static final String ALL_FIELDS = " id, age_from, age_to, center_external_id, club_external_id, " +
            "contacts, description, is_approved, is_online, name, rating, url_background, url_logo, url_web, " +
            "work_time, center_id, user_id, feedback_count ";

    public static final String SELECT_ALL = "SELECT" + ALL_FIELDS + "FROM clubs ORDER BY id;";

    public static final String SELECT_ALL_WHERE_NAME_LIKE =  "SELECT" + ALL_FIELDS + "FROM clubs WHERE name LIKE '%s%%';";

    public static final String SELECT_ALL_WHERE_LOCATION_LIKE =  "SELECT" + ALL_FIELDS +
            "FROM clubs as cl " +
            "JOIN locations l ON cl.id = l.club_id " +
            "JOIN cities ct ON l.city_id = ct.id " +
            "WHERE ct.name = '%s'";

    private long userId;
    private int ageFrom;
    private int ageTo;
    private long centerExternalId;
    private long centerId;
    private long clubExternalId;
    private String contacts;
    private String description;
    private long feedbackCount;
    private long id;
    private boolean isApproved;
    private boolean isOnline;
    private String Name;
    private double rating;
    private String urlBackground;
    private String urlLogo;
    private String urlWeb;
    private String workTime;

    public static ClubEntity parseRow(List<String> row) {
        ClubEntity club = new ClubEntity();
        club.setId(Long.parseLong(row.get(0)));
        club.setAgeFrom(Integer.parseInt(row.get(1)));
        club.setAgeTo(Integer.parseInt(row.get(2)));
        club.setCenterExternalId(Long.parseLong(row.get(3) == null ? "0" : row.get(3)));
        club.setClubExternalId(Long.parseLong(row.get(4) == null ? "0" : row.get(4)));
        club.setContacts(row.get(5));
        club.setDescription(row.get(6));
        club.setApproved(Boolean.parseBoolean(row.get(7)));
        club.setOnline(Boolean.parseBoolean(row.get(8)));
        club.setName(row.get(9));
        club.setRating(Double.parseDouble(row.get(10)));
        club.setUrlBackground(row.get(11));
        club.setUrlLogo(row.get(12));
        club.setUrlWeb(row.get(13));
        club.setWorkTime(row.get(14));
        club.setCenterId(Long.parseLong(row.get(15) == null ? "0" : row.get(15)));
        club.setUserId(Long.parseLong(row.get(16) == null ? "0" : row.get(16)));
        club.setFeedbackCount(Integer.parseInt(row.get(17) == null ? "0" : row.get(17)));
        return club;

    }

    public static List<ClubEntity> parseRows(List<List<String>> rows) {
        List<ClubEntity> clubEntities = new ArrayList<>();
        for(List<String> row: rows){
            clubEntities.add(parseRow(row));
        }
        return clubEntities;
    }
}
