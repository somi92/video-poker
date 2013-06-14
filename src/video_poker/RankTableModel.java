package video_poker;

import game_engine.hand_ranks.HandRank;
import game_engine.hand_ranks.HandRankFactory;

import javax.swing.table.AbstractTableModel;

public class RankTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8669042092517188454L;
	
	private String[] columnNames;
	private Object[][] data;
	@SuppressWarnings("rawtypes")
	Class[] columnTypes = new Class[] {
			String.class, Long.class, Long.class, Long.class, Long.class, Long.class
		};
	
	public RankTableModel() {
		super();
		initializeTheData(HandRankFactory.getAllHandRanks());
//		initializeTheData(ranks);
	}

	private void initializeTheData(HandRank[] ranks) {
		String[] columnNames = {"Rank","Bet 1","Bet 2","Bet 3","Bet 4","Bet 5"};
		this.columnNames = columnNames;
		this.data = new Object[11][columnNames.length];
		for (int i=0; i<ranks.length-1; i++) {
			data[i+1][0] = " "+ranks[i].getRankTitle();
			data[i+1][1] = new Long(ranks[i].getWinRatio()*1);
			data[i+1][2] = new Long(ranks[i].getWinRatio()*2);
			data[i+1][3] = new Long(ranks[i].getWinRatio()*3);
			data[i+1][4] = new Long(ranks[i].getWinRatio()*4);
			data[i+1][5] = new Long(ranks[i].getWinRatio()*5);
		}
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return data[row][col];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int columnIndex) {
		return columnTypes[columnIndex];
	}

}
