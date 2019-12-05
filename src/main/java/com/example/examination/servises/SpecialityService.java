package com.example.examination.servises;

import com.example.examination.entity.Speciality;
import com.example.examination.repositories.SpecialityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpecialityService implements BaseService <Speciality> {

    private final SpecialityRepository specialityRepository;


    @Override
    public List<Speciality> getAll() {
        return null;
    }

    @Override
    public Speciality getByName(String name) {
        return null;
    }

    @Override
    public Speciality getById(Long id) {
        return null;
    }

    @Override
    public void save(Speciality user) {

    }
}
