package qa.free.tools.reporting.repositories

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import qa.free.tools.reporting.entities.TestExecution
import java.util.*

@Repository
interface TestExecutionRepository : JpaRepository<TestExecution, Long> {

    override fun findAll(pageable: Pageable): Page<TestExecution>

    fun deleteByTestUuid(uuid: String): Int

    fun findByTestUuid(uuid: String): TestExecution
}