import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Week6Capstone.entity.Task;
import com.capstone.Week6Capstone.entity.User;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findAllByOrderByName();

	List<Task> findAllByUser(User user);
}
