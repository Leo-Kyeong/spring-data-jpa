package study.datajpa.repository;

import study.datajpa.entity.Member;

import java.util.List;

public interface memberRepositoryCustom {
    List<Member> findMemberCustom();
}
