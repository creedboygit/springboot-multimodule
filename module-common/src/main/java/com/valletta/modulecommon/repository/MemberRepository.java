package com.valletta.modulecommon.repository;

import com.valletta.modulecommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
