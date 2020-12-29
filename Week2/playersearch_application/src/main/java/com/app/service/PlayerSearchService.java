package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {
	
	public Player getPlayerById(int player_id) throws BusinessException;
	public Player getPlayerByJerseyNo(int jersey_no) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByAge(int player_age) throws BusinessException;
	public List<Player> getPlayersByGender(String player_gender) throws BusinessException;
	public List<Player> getAllPlayersByTeamId(int team_id) throws BusinessException;
	public List<Player> getAllPlayersByName(String player_name) throws BusinessException;
	public List<Player> getAllPlayersByPositionId(int position_id) throws BusinessException;
	public List<Player> getAllPlayersStateId(int state_id) throws BusinessException;
	public List<Player> getPlayersByDOB(String dob) throws BusinessException;


}
