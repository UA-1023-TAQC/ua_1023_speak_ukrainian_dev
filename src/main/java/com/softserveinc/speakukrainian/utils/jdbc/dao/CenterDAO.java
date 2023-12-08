package com.softserveinc.speakukrainian.utils.jdbc.dao;

import com.softserveinc.speakukrainian.utils.jdbc.entity.CenterEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CenterDAO {
    public List<CenterEntity> selectFirsSixCentersAscendingByName() {
        Statement statement = ManagerDAO.getInstance().getStatement();
        List<List<String>> rows = null;
        try {
            ResultSet resultSet = statement.executeQuery(CenterEntity.SELECT_FIRST_SIX_CENTERS_ASC);
            rows = ManagerDAO.getInstance().parseResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ManagerDAO.closeStatement(statement);
        return CenterEntity.parseRows(rows);

    }

    public List<CenterEntity> selectFirsSixCentersDescendingByName() {
        Statement statement = ManagerDAO.getInstance().getStatement();
        List<List<String>> rows = null;
        try {
            ResultSet resultSet = statement.executeQuery(CenterEntity.SELECT_FIRST_SIX_CENTERS_DESC);
            rows = ManagerDAO.getInstance().parseResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ManagerDAO.closeStatement(statement);
        return CenterEntity.parseRows(rows);
    }

    public List<CenterEntity> selectCentersAscendingByRating(){
        Statement statement = ManagerDAO.getInstance().getStatement();
        List<List<String>> rows = null;
        try {
            ResultSet resultSet = statement.executeQuery(CenterEntity.SELECT_FIRST_SIX_CENTERS_RATING_ASC);
            rows = ManagerDAO.getInstance().parseResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ManagerDAO.closeStatement(statement);
        return CenterEntity.parseRows(rows);
    }

    public List<CenterEntity> selectCentersDescendingByRating(){
        Statement statement = ManagerDAO.getInstance().getStatement();
        List<List<String>> rows = null;
        try {
            ResultSet resultSet = statement.executeQuery(CenterEntity.SELECT_FIRST_SIX_CENTERS_RATING_DESC);
            rows = ManagerDAO.getInstance().parseResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ManagerDAO.closeStatement(statement);
        return CenterEntity.parseRows(rows);
    }
}
