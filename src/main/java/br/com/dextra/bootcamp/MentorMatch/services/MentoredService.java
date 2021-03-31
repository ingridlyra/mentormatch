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

    public List<MentoredResponse> list() {
        return mentoredRepository.findAll().stream()
                .map(mentored -> new MentoredResponse(mentored))
                .collect(Collectors.toList());

    }

    public MentoredResponse findOne(Long id) throws UnexistentEntityException { //fazer essa exceção
        Mentored mentored = this.findById(id);
        return new MentoredResponse(mentored);
    }

    public Mentored update(Mentored mentored) {
        return mentoredRepository.save(mentored);
    }

    public void delete(long id) {
        mentoredRepository.deleteById();
    }

    public Mentored findById(Long id) throws UnexistentEntityException{ //fazer essa exceção
        Optional<Mentored> mentored = mentoredRepository.findById(id);
        if (mentored.isEmpty) {
            throw new UnexistentEntityException("O mentorado não existe no banco");
        }
        return mentored.get();
    }


}
