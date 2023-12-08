package com.softserveinc.speakukrainian.utils.jdbc.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CenterEntity {
    private static final String ALL_FIELDS = " id, center_external_id, contacts, description, name, " +
            "url_background_picture, url_logo, url_web, user_id, club_count, rating ";

    public static final String SELECT_ALL = "SELECT" + ALL_FIELDS + "FROM centers ORDER BY id;";

    public static final String SELECT_FIRST_SIX_CENTERS_ASC = "SELECT" + ALL_FIELDS
            + "FROM centers ORDER BY name LIMIT 6;";

    public static final String SELECT_FIRST_SIX_CENTERS_DESC = "SELECT" + ALL_FIELDS
            + "FROM centers ORDER BY name DESC LIMIT 6;";

    public static final String SELECT_FIRST_SIX_CENTERS_RATING_ASC = "SELECT" + ALL_FIELDS
            + "FROM centers ORDER BY rating LIMIT 6;";

    public static final String SELECT_FIRST_SIX_CENTERS_RATING_DESC = "SELECT" + ALL_FIELDS
            + "FROM centers ORDER BY rating DESC LIMIT 6;";

    private long id;
    private long centerExternalId;
    private String contacts;
    private String description;
    private String name;
    private String urlBackgroundPicture;
    private String urlLogo;
    private String urlWeb;
    private long userId;
    private long clubCount;
    private double rating;

    public static CenterEntity parseRow(List<String> row) {
        CenterEntity center = new CenterEntity();
        center.setId(Long.parseLong(row.get(0)));
        center.setCenterExternalId(Long.parseLong(row.get(1) == null ? "0" : row.get(1)));
        center.setContacts(row.get(2));
        center.setDescription(row.get(3));
        center.setName(row.get(4));
        center.setUrlBackgroundPicture(row.get(5));
        center.setUrlLogo(row.get(6));
        center.setUrlWeb(row.get(7));
        center.setUserId(Long.parseLong(row.get(8) == null ? "0" : row.get(8)));
        center.setClubCount(Long.parseLong(row.get(9) == null ? "0" : row.get(9)));
        center.setRating(Double.parseDouble(row.get(10) == null ? "0" : row.get(10)));
        return center;
    }

    public static List<CenterEntity> parseRows(List<List<String>> rows) {
        List<CenterEntity> centerEntities = new ArrayList<>();
        for(List<String> row: rows){
            centerEntities.add(parseRow(row));
        }
        return centerEntities;
    }
}
