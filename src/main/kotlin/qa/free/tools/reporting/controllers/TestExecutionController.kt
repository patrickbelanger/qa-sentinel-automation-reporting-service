package qa.free.tools.reporting.controllers

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import qa.free.tools.reporting.entities.TestExecution
import qa.free.tools.reporting.services.TestExecutionService
import java.util.UUID

@RestController
@RequestMapping("/api/v1/test-execution")
class TestExecutionController(val service: TestExecutionService) {

    @GetMapping
    fun getTestExecutions(@RequestParam(defaultValue="0") page: Int,
                          @RequestParam(defaultValue="10") size: Int): Page<TestExecution> {
        return service.getTestExecutions(PageRequest.of(page, size))
    }

    @GetMapping("/{uuid}")
    fun getTestExecution(@PathVariable uuid: String) : TestExecution {
        return service.getTestExecution(UUID.fromString(uuid))
    }

    @PostMapping
    fun setTestExecution(@RequestBody testExecution: TestExecution) {
        service.saveTestExecution(testExecution)
    }

}