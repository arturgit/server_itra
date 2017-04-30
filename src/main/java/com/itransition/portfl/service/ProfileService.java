package com.itransition.portfl.service;

import com.itransition.portfl.dto.ProfileDTO;
import com.itransition.portfl.model.Profile;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Kulik Artur
 */
public interface ProfileService {
    Profile findByUserId(Integer id);

    Profile findById(Integer id);

    Integer save(ProfileDTO profileDTO);

    void delete(Integer id);

    Integer findRatingByUserId(Integer id);

    Profile findByUserDetals(UserDetails userDetails);
}
