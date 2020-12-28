package com.app.main;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.Impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchMain {

	public static void main(String[] args) {
		PlayerSearchDAO dao = new PlayerSearchDAOImpl();
		
		//Method for GetPlayerByJerseyNo
		try {
			Player player = dao.getPlayerbyJersey_No(100);
			if (player!=null) {
				System.out.println("Details of player with jersey no. "+player.getJersey_no());
				System.out.println(player);
			}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

	
	
	//method for GetPlayersByPlayerName
	try {
		List<Player> playerList = dao.getPlayersbyPlayer_gender("M");
		if(playerList!=null && playerList.size()!=0) {
			System.out.println("Found "+playerList.size()+" no of players in DB... Printing them all");
			for(Player p:playerList) {
				System.out.println(p);
			}
		}
	}catch (BusinessException e) { 
		System.out.println(e.getMessage());
	}
	}
}

