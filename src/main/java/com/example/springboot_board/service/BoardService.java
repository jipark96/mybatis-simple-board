package com.example.springboot_board.service;

import com.example.springboot_board.dto.BoardDTO;
import com.example.springboot_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    //글 작성
    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }

    //글 조회
    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    //글 상세 조회
    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    //조회 수
    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    //글 수정
    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    //글 삭제
    public void delete(Long id) {
        boardRepository.delete(id);
    }

}
