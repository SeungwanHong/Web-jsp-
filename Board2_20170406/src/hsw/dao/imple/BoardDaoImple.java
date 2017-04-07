package hsw.dao.imple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hsw.dao.BaseDao;
import hsw.dao.BoardDao;
import hsw.dao.UserDao;
import hsw.vo.board.BoardVo;
import hsw.vo.user.UserVo;

public class BoardDaoImple extends BaseDao implements BoardDao{

	@Override
	public List<BoardVo> boardList() {
		List<BoardVo> boardList = new ArrayList<>();
		sql= "select * from TB_BOARD_DEMO";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				BoardVo boardContent = new BoardVo();
				boardContent.setBidx(rs.getInt("BINDX"));
				boardContent.setTitle((rs.getString("TITLE")));
				boardContent.setContents(rs.getString("CONTENTS"));
				boardContent.setUserId(rs.getString("USERID"));
				boardContent.setWriteDate(rs.getString("WRITEDATE"));
				boardContent.setModDate(rs.getString("MODDATE"));
				boardContent.setHitCnt(rs.getInt("HTICNT"));
				
				boardList.add(boardContent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		return boardList;
	}

	@Override
	public BoardVo boardContent(int bIndex) {
		BoardVo boardContent = new BoardVo();
		sql = "select * from TB_BOARD_DEMO WHERE BINDX = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bIndex);
	
			rs = pstmt.executeQuery();
			while(rs.next()){
				boardContent.setBidx(rs.getInt("BINDX"));
				boardContent.setTitle((rs.getString("TITLE")));
				boardContent.setContents(rs.getString("CONTENTS"));
				boardContent.setUserId(rs.getString("USERID"));
				boardContent.setWriteDate(rs.getString("WRITEDATE"));
				boardContent.setModDate(rs.getString("MODDATE"));
				boardContent.setHitCnt(rs.getInt("HTICNT"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return boardContent;
	}

	
}
//public List<BoardVo> boardList(){
//	List<BoardVo> boardList = new ArrayList<>();
//	String sql= "select * from TB_BOARD_DEMO";
//	Connection conn = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	try {
//		conn = getConnection();
//		pstmt = conn.prepareStatement(sql);
//
//		rs = pstmt.executeQuery();
//		while(rs.next()){
//			BoardVo boardContents = new BoardVo();
//			boardContents.setBidx(rs.getInt("BINDX"));
//			boardContents.setTitle((rs.getString("TITLE")));
//			boardContents.setContents(rs.getString("CONTENTS"));
//			boardContents.setUserId(rs.getString("USERID"));
//			boardContents.setWriteDate(rs.getString("WRITEDATE"));
//			boardContents.setModDate(rs.getString("MODDATE"));
//			boardContents.setHitCnt(rs.getInt("HTICNT"));
//			
//			boardList.add(boardContents);
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}finally{
//		try {
//			rs.close();
//			pstmt.close();
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	return boardList;
//}
//public BoardVo boardContentsView(int bIndex){
//	BoardVo boardContents = new BoardVo();
//	String sql= "select * from TB_BOARD_DEMO WHERE BINDX = ?";
//	Connection conn = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	try {
//		conn = getConnection();
//		pstmt = conn.prepareStatement(sql);
//		pstmt.setInt(1, bIndex);
//
//		rs = pstmt.executeQuery();
//		while(rs.next()){
//			boardContents.setBidx(rs.getInt("BINDX"));
//			boardContents.setTitle((rs.getString("TITLE")));
//			boardContents.setContents(rs.getString("CONTENTS"));
//			boardContents.setUserId(rs.getString("USERID"));
//			boardContents.setWriteDate(rs.getString("WRITEDATE"));
//			boardContents.setModDate(rs.getString("MODDATE"));
//			boardContents.setHitCnt(rs.getInt("HTICNT"));
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}finally{
//		try {
//			rs.close();
//			pstmt.close();
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	return boardContents;
//}
