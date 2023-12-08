package com.softserveinc.speakukrainian.utils.jdbc.services;

import com.softserveinc.speakukrainian.utils.jdbc.dao.CenterDAO;
import com.softserveinc.speakukrainian.utils.jdbc.entity.CenterEntity;

import java.util.List;

public class CenterService {
    private final CenterDAO centerDAO;

    public CenterService(){
        centerDAO = new CenterDAO();
    }

    public List<CenterEntity> getFirstSixCentersAscendingByName(){
        return centerDAO.selectFirsSixCentersAscendingByName();
    }

    public List<CenterEntity> getFirstSixCentersDescendingByName(){
        return centerDAO.selectFirsSixCentersDescendingByName();
    }

    public List<CenterEntity> getCentersAscendingByRating(){
        return centerDAO.selectCentersAscendingByRating();
    }

    public List<CenterEntity> getCentersDescendingByRating(){
        return centerDAO.selectCentersDescendingByRating();
    }
}
