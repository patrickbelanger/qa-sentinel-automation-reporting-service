package qa.free.tools.reporting.services

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import qa.free.tools.reporting.entities.TestExecution
import qa.free.tools.reporting.repositories.TestExecutionRepository
import java.util.UUID

@Service
class TestExecutionService(val repository: TestExecutionRepository) {

    fun getTestExecutions(pageable : Pageable): Page<TestExecution> {
        return repository.findAll(pageable)
    }

    fun getTestExecution(uuid: UUID): TestExecution {
        return repository.findTestExecutionById(uuid)
    }

    fun saveTestExecution(testExecution: TestExecution) : TestExecution {
        return repository.save(testExecution)
    }

}