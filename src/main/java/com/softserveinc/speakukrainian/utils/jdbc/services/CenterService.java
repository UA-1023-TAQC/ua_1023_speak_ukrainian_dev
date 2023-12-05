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

}
