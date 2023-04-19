package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.model.Complain;
import com.cs304project.MotorTraffic.repository.ComplainRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
@Transactional
public class ComplainService {

    @Autowired
    ComplainRepository complainRepository;



    public Complain createComplain(MultipartFile video, String district, String lastName, String phone, String nic_num) throws IOException {
        Complain newComplain = new Complain();
        newComplain.setVideo(Base64.getEncoder().encodeToString((video.getBytes())));
        newComplain.setDistrict(district);
        newComplain.setLastName(lastName);
        newComplain.setPhone(phone);
        newComplain.setNic_num(nic_num);

        complainRepository.save(newComplain);
        return newComplain;

    }

    public List<Complain> getAllComplains() {
        return complainRepository.findAll();
    }


    public void deleteComplainById(int id) {
        complainRepository.deleteComplainById(id);

    }
}



