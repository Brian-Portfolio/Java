package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerbyJersey_No(int jersey_no) throws BusinessException;
	public List<Player> getPlayersbyPlayer_gender(String player_gender) throws BusinessException;
	
}
