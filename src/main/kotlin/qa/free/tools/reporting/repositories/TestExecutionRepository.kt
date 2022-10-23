package qa.free.tools.reporting.repositories

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import qa.free.tools.reporting.entities.TestExecution
import java.util.UUID

@Repository
interface TestExecutionRepository : JpaRepository<TestExecution, Long> {

    override fun findAll(pageable : Pageable): Page<TestExecution>
    override fun <S : TestExecution> save(entity: S): S;
    @Query("SELECT * FROM test_execution WHERE testuuid = :uuid", nativeQuery = true)
    fun findTestExecutionById(uuid: UUID): TestExecution

}