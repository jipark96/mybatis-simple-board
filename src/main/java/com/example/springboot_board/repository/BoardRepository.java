package com.example.springboot_board.repository;

import com.example.springboot_board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;

    //글 작성
    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO);
    }

    //글 조회
    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }

    //글 상세 조회
    public BoardDTO findById(Long id) {
        return sql.selectOne("Board.findById",id);
    }

    //조회 수
    public void updateHits(Long id) {
        sql.update("Board.updateHits",id);
    }

    //글 수정
    public void update(BoardDTO boardDTO) {
        sql.update("Board.update", boardDTO);
    }

    //글 삭제
    public void delete(Long id) {
        sql.delete("Board.delete", id);
    }

}
