package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.dao.PlayerCrudDao;
import com.app.dao.Impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerCrudDao dao= new PlayerCrudDAOImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Player Functions");
		System.out.println("-----------------------------------");
		int ch=0;
		do {
			System.out.println("Player Functions");
			System.out.println("=========================");
			System.out.println("1)Creating a Player)");
			System.out.println("2)Deleting a Player)");
			System.out.println("3)Updating a Jersey Number)");
			System.out.println("4)Get Player by ID)");
			System.out.println("5)Get all Players)");
			System.out.println("6)EXIT)");
			System.out.println("Please enter appropriate choice between 1-6");
			try {	
			ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {}
			
		switch(ch) {
		case 1:
			//Method for creating Player ()
			System.out.println("Please Enter the information to create your player in the order of : (player_id, player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, player_gender, dob)");

			Player p = new Player(12, "Lloyd", 345, 43, 306, 99, 1005, 406, "M", "1990-04-40");
			
			try {
				if(dao.createPLayer(p)!=0) {
					
					System.out.println("Player Created Successfully");
				}
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
		 break;
		 
		case 2:
			//Method for deleteplayerbyID()
			try {
				dao.deletePlayer(2);
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
		break;
		
		case 3:
		//Method for UpdateJerseyNo
				try {
				if(dao.updateJerseyNo(6,88)!=0) {
					System.out.println("Player Updated successfully");
				}
				}catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			
		
		
		case 4:
		//Method for getplayerbyID() 
		try {
			Player player = dao.getPlayerById(3);
			if (player!=null) {
				System.out.println("Details of player with id "+player.getPlayer_id());
				System.out.println(player);
			}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		break;
		
		case 5:
		
			//Method for getallplayers()
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
		break;
		
		case 6:
			System.out.println("Thank you for trying player functions! ");
			break;
			
		default: System.out.println("Invalid menu option... Kindly Retry...........!!!!");
		break; 
		}
		}while(ch!=6);
	}
}
	


