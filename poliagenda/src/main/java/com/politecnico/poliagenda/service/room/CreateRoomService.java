package com.politecnico.poliagenda.service.room;

import org.springframework.stereotype.Service;

import com.politecnico.poliagenda.repository.RoomRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateRoomService {

    private final RoomRepository roomRepository;
}
