package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDao {

	public int createPLayer(Player player) throws BusinessException;
	public void deletePlayer(int player_id) throws BusinessException;
	public int updateJerseyNo(int player_id, int jersey_no) throws BusinessException;
	public Player getPlayerById(int player_id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
}
