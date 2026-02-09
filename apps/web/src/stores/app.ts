import { defineStore } from 'pinia';

type ReleaseStage = 'DEV' | 'TEST' | 'PROD';

interface AppState {
  openTasks: number;
  apiHealth: string;
  releaseStage: ReleaseStage;
}

export const useAppStore = defineStore('app', {
  state: (): AppState => ({
    openTasks: 6,
    apiHealth: 'Healthy',
    releaseStage: 'DEV'
  }),
  actions: {
    setApiHealth(value: string) {
      this.apiHealth = value;
    },
    setReleaseStage(stage: ReleaseStage) {
      this.releaseStage = stage;
    }
  }
});
