package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDao;
import com.app.dao.Impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerCrudDao dao= new PlayerCrudDAOImpl();
		
		//Method for creating Player 
		Player p = new Player(7, "FitzPatrick", 105, 43, 306, 99, 1005, 406, "M");
		
		try {
			if(dao.createPLayer(p)!=0) {
				System.out.println("Player created successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
			
		
		//Method for deleteplayerbyID
		try {
			dao.deletePlayer(100);
		} catch (BusinessException e) {
			System.out.println(e);
		}
		
		//Method for UpdateJerseyNo
		try {
		if(dao.updateJerseyNo(6,88)!=0) {
			System.out.println("Player Updated successfully");
		}
		}catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		//Method for getplayerbyID 
		try {
			Player player = dao.getPlayerById(6);
			if (player!=null) {
				System.out.println("Details of player with id "+player.getPlayer_id());
				System.out.println(player);
			}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		//Method for getallplayers
		try {
			List<Player> playerList = dao.getAllPlayers();
			if(playerList!=null && playerList.size()!=0) {
				System.out.println("Found "+playerList.size()+" no of players in DB... Printing them all");
				for(Player p1:playerList) {
					System.out.println(p1);
				}
			}
		}catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
