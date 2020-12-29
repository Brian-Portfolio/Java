package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int player_id) throws BusinessException {
		Player player=null;
		if (player_id>0 && player_id<1000) {
			//code here for DAO
			player=playerSearchDAO.getPlayerById(player_id);
		}else {
			throw new BusinessException("Entered Player Id "+player_id+" is INVALID......");
		}
		return player;
	}

	@Override
	public Player getPlayerByJerseyNo(int jersey_no) throws BusinessException {
		Player player=null;
		if (jersey_no>0 && jersey_no<100) {
			//code here for DAO
			player=playerSearchDAO.getPlayerByJerseyNo(jersey_no);
		}else {
			throw new BusinessException("Entered Player Jersey Number "+jersey_no+" is INVALID......");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> AllPlayersList=null;
		AllPlayersList = playerSearchDAO.getAllPlayers();
		return AllPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int player_age) throws BusinessException {
		List<Player> ageplayersList = null;
		if (player_age>19 && player_age<45) {
			//code here for DAO
			ageplayersList=playerSearchDAO.getPlayersByAge(player_age);
		}else {
			throw new BusinessException("Entered Player Age "+player_age+" is INVALID......");
		}
		return ageplayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String player_gender) throws BusinessException {
		List<Player> PlayersGenderList=null;
		if (player_gender!=null && player_gender.matches("[A-Z]{1}")) {
			PlayersGenderList=playerSearchDAO.getPlayersByGender(player_gender);
		}else {
			throw new BusinessException("Entered Player gender "+player_gender+" is INVALID");
		}
		return PlayersGenderList;
	}

	@Override
	public List<Player> getAllPlayersByTeamId(int team_id) throws BusinessException {
		List<Player> teamplayersList = null;
		if (team_id>99 && team_id<107) {
			//code here for DAO
			teamplayersList=playerSearchDAO.getAllPlayersByTeamId(team_id);
		}else {
			throw new BusinessException("Entered Team Id "+team_id+" is INVALID......");
		}
		return teamplayersList;
	}

	@Override
	public List<Player> getAllPlayersByName(String player_name) throws BusinessException {
		List<Player> NamesPlayersList=null;
		if (player_name!=null && player_name.matches("[a-zA-Z]{4,20}")) {
			NamesPlayersList=playerSearchDAO.getAllPlayersByName(player_name);
		}else {
			throw new BusinessException("Entered Player Name "+player_name+" is INVALID");
		}
		return NamesPlayersList;
	}

	@Override
	public List<Player> getAllPlayersByPositionId(int position_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayersStateId(int state_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByDOB(String dob) throws BusinessException {
		List<Player> PlayersDOBList=null;
		if (dob!=null && dob.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")){// && dob.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}") {
			PlayersDOBList=playerSearchDAO.getPlayersByDOB(dob);
		}else {
			throw new BusinessException("Entered Player Date of Birth "+dob+" is INVALID");
		}
		return PlayersDOBList;
	}

}
