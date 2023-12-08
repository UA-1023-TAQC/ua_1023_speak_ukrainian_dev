package com.softserveinc.speakukrainian.utils.jdbc.services;

import com.softserveinc.speakukrainian.utils.jdbc.dao.ClubDAO;
import com.softserveinc.speakukrainian.utils.jdbc.entity.ClubEntity;

import java.util.List;

public class ClubService {
    private final ClubDAO clubDAO;

    public ClubService(){
        clubDAO = new ClubDAO();
    }

    public List<ClubEntity> getAll(){
        return clubDAO.selectAll();
    }

    public List<ClubEntity> getAllByName(String name){
        return clubDAO.selectName(name);
    }

    public List<ClubEntity> getAllByLocation(String location){
        return clubDAO.selectLocation(location);
    }

}
