import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearPersonaComponent } from './crear-persona.component';

describe('CrearPersonaComponent', () => {
  let component: CrearPersonaComponent;
  let fixture: ComponentFixture<CrearPersonaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CrearPersonaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CrearPersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
