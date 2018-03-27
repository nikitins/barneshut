import barneshut.{BarnesHut, SimulationModel, Simulator}

object Main extends App {
  val model = new SimulationModel

  var simulator: Simulator = _

    model.initialize(4, "two-galaxies", 25000)
    model.timeStats.clear()
    simulator = new Simulator(model.taskSupport, model.timeStats)

  val (bodies, quad) = simulator.step(model.bodies)
  model.bodies = bodies
  model.quad = quad
}
