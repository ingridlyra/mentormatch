package br.com.dextra.bootcamp.MentorMatch.services;

import br.com.dextra.bootcamp.MentorMatch.models.MentorResponse
import br.com.dextra.bootcamp.MentorMatch.models.exceptions.UnexistentEntityException;
import br.com.dextra.bootcamp.MentorMatch.repositories.MentorRepository;
import org.springframework.stereotype.Service;
import br.com.dextra.bootcamp.MentorMatch.models.Mentor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MentorService {

    MentorRepository mentorRepository;

    MentoredService mentoredService;

    //MatchService matchService;

    public Mentor create(Mentor mentor) {
        return mentorRepository.save(mentor);

    }

    public List<MentorResponse> list() {
        return mentorRepository.findAll().stream()
                .map(mentor -> new MentorResponse(mentor)) //TODO: DEFINIR A CLASSE MENTORRESPONSE
                .collect(Collectors.toList());

    }

    public MentorResponse findOne(Long id) throws UnexistentEntityException {
        Mentor mentor = this.findById(id);
        return new MentorResponse(mentor);
    }

    public Mentor update(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public void delete(long id) {
        mentorRepository.deleteById(id);
    }

    public Mentor findById(Long id) throws UnexistentEntityException {
        Optional<Mentor> mentor = mentorRepository.findById(id);
        if (mentor == null) {
            throw new UnexistentEntityException("O mentor não existe no banco");
        }
        return mentor.get();
    }

    public void likeMentored(Long mentoredId, Long mentorId) {
//        TODO: Terminar esse método

    }

    ;

}

