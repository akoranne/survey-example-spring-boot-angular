package com.github.joumenharzli.surveypoc.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;

import com.github.joumenharzli.surveypoc.domain.UserResponse;
import com.github.joumenharzli.surveypoc.service.dto.UserResponseForQuestionDto;

/**
 * UserResponseMapper
 *
 * @author Joumen HARZLI
 */
@Mapper(componentModel = "spring")
@Service
public interface UserResponseMapper {

  @Mapping(source = "question.id", target = "questionId")
  UserResponseForQuestionDto mapUserResponseForQuestionToDto(UserResponse entity);

  @Mapping(source = "question.id", target = "questionId")
  List<UserResponseForQuestionDto> mapUserResponsesForQuestionsToDto(List<UserResponse> entity);
}