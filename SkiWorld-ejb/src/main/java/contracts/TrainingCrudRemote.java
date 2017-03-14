package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Training;

@Remote
public interface TrainingCrudRemote {
	public void addTraining(Training T);
	public void updateTraining(Training T);
	public void deleteTraining(Training T);
	public Training  findTrainingByID(int idTraining);
	public List<Training> findAllTrainings();
}
