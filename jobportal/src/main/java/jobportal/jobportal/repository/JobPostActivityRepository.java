package jobportal.jobportal.repository;

import jobportal.jobportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {
}
