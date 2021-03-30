package br.com.dextra.bootcamp.MentorMatch.services;

import br.com.dextra.bootcamp.MentorMatch.models.Mentored;
import br.com.dextra.bootcamp.MentorMatch.models.MentoredResponse;
import br.com.dextra.bootcamp.MentorMatch.repositories.MentoredRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.dextra.bootcamp.MentorMatch.models.Mentor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MentoredService {

    MentoredRepository mentoredRepository;

    MentorService mentorService;

    //MatchService matchService;

    public Mentored create(Mentored mentored) {
        return mentoredRepository.save(mentored);

    }

    public List<MentoredResponse> findAllById() {
        return mentoredRepository.findAll().stream().map(mentored -> new MentoredResponse(mentored)).collect(Collectors.toList()));
    }

    public <S extends Mentored> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Mentored> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mentored getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mentored> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Mentored> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Mentored> S save(S entity) {
        return null;
    }

    public findOne<Mentored> findById(Long aLong) {
        return findOne.empty();
    }

    @Override
    public void deleteById(Long id) {
        mentoredRepository.deleteById(id);
    }

}


}
