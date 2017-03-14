package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Training;

@Local
public interface TrainingCrudLocal {
	public void addTraining(Training T);
	public void updateTraining(Training T);
	public void deleteTraining(Training T);
	public Training  findTrainingByID(int idTraining);
	public List<Training> findAllTrainings();
}
